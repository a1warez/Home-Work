ALTER TABLE authors
    ALTER COLUMN author_name SET NOT NULL;

ALTER TABLE publishers
    ALTER COLUMN publisher_name SET NOT NULL;

ALTER TABLE publishers
    ALTER COLUMN publisher_city SET DEFAULT 'Unknown';

ALTER TABLE books
    ALTER COLUMN book_title SET NOT NULL;

ALTER TABLE books
    ALTER COLUMN publisher_id SET NOT NULL;

ALTER TABLE books
    ADD CONSTRAINT books_publication_year_check CHECK (publication_year > 0);

ALTER TABLE books DROP CONSTRAINT books_publisher_id_fkey;

ALTER TABLE books
    ADD CONSTRAINT books_publisher_id_fkey
    FOREIGN KEY (publisher_id)
    REFERENCES publishers(publisher_id)
    ON DELETE CASCADE;

ALTER TABLE authors_books DROP CONSTRAINT authors_books_author_id_fkey;

ALTER TABLE authors_books
    ADD CONSTRAINT authors_books_author_id_fkey
    FOREIGN KEY (author_id)
    REFERENCES authors(author_id)
    ON DELETE CASCADE;

ALTER TABLE authors_books DROP CONSTRAINT authors_books_book_id_fkey;

ALTER TABLE authors_books
    ADD CONSTRAINT authors_books_book_id_fkey
    FOREIGN KEY (book_id)
    REFERENCES books(book_id)
    ON DELETE CASCADE;

INSERT INTO  authors (author_name)
VALUES (NULL);

INSERT INTO  books(book_title,publisher_id,publication_year, price)
VALUES ('BOOK_NEME1', 15 , -2500, NULL)

    INSERT INTO  publishers(publisher_name, publisher_city)
VALUES (NULL, NULL)


CREATE TABLE category (
  id SERIAL PRIMARY KEY,
  name TEXT,
  parent_id INT
);

INSERT INTO category(name, parent_id)
VALUES ('Электроника', null);

INSERT INTO category(name, parent_id)
VALUES ('Компьютеры', 1);

INSERT INTO category(name, parent_id)
VALUES ('Смартфоны', 1);