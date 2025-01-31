CREATE TABLE public."Product"(
   id SERIAL,
   name VARCHAR(150),
   price DOUBLE PRECISION,
   Product_category VARCHAR(15)
);

CREATE TABLE public."Customer"(
   id SERIAL,
   name VARCHAR(150),
   city VARCHAR(25),
   Customer_category VARCHAR(15)
);

CREATE TABLE public."Ordre"(
   id SERIAL,
   id_Customer VARCHAR(7),
   id_Product VARCHAR(7),
   Order_category VARCHAR(15)
);

ALTER TABLE IF EXISTS public."Product"
    OWNER to postgres;

ALTER TABLE IF EXISTS public."Customer"
    OWNER to postgres;

ALTER TABLE IF EXISTS public."Ordre"
    OWNER to postgres;

SELECT * FROM "Customer";

SELECT * FROM "Customer"
WHERE city = 'Санкт-Петербург'
ORDER BY name ASC;

INSERT INTO "Customer" (name, city, Customer_category)
VALUES ('Артем', 'Ленинград', 'NEW'),
       ('Виолетта', 'Москва', 'REGULAR'),
       ('Марк', 'Ленинград', 'VIP')


UPDATE "Customer"
SET city = 'Санкт-Петербург'
WHERE city = 'Ленинград';

UPDATE "Customer"
SET name = 'Вова'
WHERE id = 1;

DELETE FROM "Customer"
WHERE id = '2';