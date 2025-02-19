CREATE TABLE public."Car"(
                             car_id SERIAL NOT NULL PRIMARY KEY,
                             brand VARCHAR(150) NOT NULL,
                             model VARCHAR(150) NOT NULL,
                             year VARCHAR(4) NOT NULL,
                             price DOUBLE PRECISION DEFAULT NULL
);

CREATE TABLE public."Dealer"(
                                dealer_id SERIAL NOT NULL PRIMARY KEY,
                                name VARCHAR(150) NOT NULL,
                                city VARCHAR(35)  NOT NULL,
                                address VARCHAR(35) NOT NULL
);

CREATE TABLE public."Dealer_car"(
                                    car_id INTEGER,
                                    dealer_id INTEGER,
                                    PRIMARY KEY (car_id, dealer_id),
                                    FOREIGN KEY (car_id) REFERENCES public."Car"(car_id) ON DELETE CASCADE,
                                    FOREIGN KEY (dealer_id) REFERENCES public."Dealer"(dealer_id) ON DELETE CASCADE
);

INSERT INTO public."Car" (brand, model, year, price)
VALUES ('Toyota', 'Camry', '2023', 3800000),
       ('BMW', '5 series', '2021', 5000000),
       ('Ford', 'Mustang', '2018', 3300000),
       ('BMW', 'X5', '2023', 8000000),
       ('Mercedes-Benz', 'AMG E-Class', '2018', 8200000),
       ('Toyota', 'AE86', '1986', 1000000),
       ('BMW', 'M3', '2021', 7000000),
       ('Ford', 'Mustang', '2018', 3300000),
       ('BMW', 'X1', '2023', 6000000),
       ('Mercedes-Benz', 'AMG E-Class', '2018', 8200000);

INSERT INTO public."Dealer" (name, city, address)
VALUES ('Dealer_one', 'Moscow', 'Donskaya St., 8'),
       ('Dealer_two', 'Saint-Petersburg', 'Novo-Rybinskaya street, 27'),
       ('Dealer_three', 'Moscow', '43 Vernadsky Avenue');

INSERT INTO public."Dealer_car" (car_id, dealer_id)
VALUES
    (6, 3),
    (7, 1),
    (8, 2),
    (9, 3),
    (10, 2);

-- кол-во машин у дилера
SELECT d.name AS dealer_name, COUNT(dc.car_id) AS car_count
FROM public."Dealer" d
         LEFT JOIN public."Dealer_car" dc ON d.dealer_id = dc.dealer_id
GROUP BY d.name
ORDER BY car_count;

--вывод инф о машине и дилере
SELECT
    c.brand AS car_brand,
    c.model AS car_model,
    c.year AS car_year,
    c.price AS car_price,
    d.name AS dealer_name,
    d.city AS dealer_city
FROM
    public."Car" c
        JOIN
    public."Dealer_car" dc ON c.car_id = dc.car_id
        JOIN
    public."Dealer" d ON dc.dealer_id = d.dealer_id
ORDER BY
    d.name, c.brand, c.model;

SELECT
    brand,
    model,
    price,
    CASE
        WHEN price > 5500000 THEN 'Luxury'
        WHEN price BETWEEN 300000 AND 5500000 THEN 'Premium'
        ELSE 'Standard'
        END AS car_category
FROM
    public."Car";


CREATE OR REPLACE VIEW public.dealer_car_summary AS
SELECT
    d.dealer_id,
    d.name AS dealer_name,
    d.city AS dealer_city,
    d.address AS dealer_address,
    COUNT(c.car_id) AS car_count,
    SUM(c.price) AS total_car_value
FROM
    public."Dealer" d
        LEFT JOIN
    public."Dealer_car" dc ON d.dealer_id = dc.dealer_id
        LEFT JOIN
    public."Car" c ON dc.car_id = c.car_id
GROUP BY
    d.dealer_id, d.name, d.city, d.address;

SELECT * FROM public.dealer_car_summary;


CREATE OR REPLACE FUNCTION public.calculate_car_age(
    production_year VARCHAR(4)
)
RETURNS INTEGER AS $$
BEGIN
RETURN EXTRACT(YEAR FROM CURRENT_DATE) - production_year::INTEGER;
END;
$$ LANGUAGE plpgsql;

SELECT brand, model, year, public.calculate_car_age(year) AS car_age
FROM public."Car";