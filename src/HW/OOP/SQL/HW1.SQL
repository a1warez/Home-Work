CREATE TABLE public.product (
                                product_id SERIAL PRIMARY KEY,
                                product_name VARCHAR(150),
                                price DOUBLE PRECISION,
                                product_category VARCHAR(15)
);

CREATE TABLE public.customer (
                                 customer_id SERIAL PRIMARY KEY,
                                 customer_name VARCHAR(150),
                                 customer_category VARCHAR(15)
);

CREATE TABLE public.ordre (
                              order_id SERIAL PRIMARY KEY,
                              customer_id INTEGER REFERENCES public.customer(customer_id),
                              product_id INTEGER REFERENCES public.product(product_id),
                              order_category VARCHAR(15)
);

ALTER TABLE IF EXISTS public.product
    OWNER to postgres;

ALTER TABLE IF EXISTS public.customer
    OWNER to postgres;

ALTER TABLE IF EXISTS public.ordre
    OWNER to postgres;