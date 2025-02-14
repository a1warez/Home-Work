ALTER TABLE books
ADD COLUMN price INTEGER;

UPDATE books
SET price = 450.00
WHERE book_title = 'Преступление и наказание';

UPDATE books
SET price = 300.00
WHERE book_title = 'Евгений Онегин';

UPDATE books
SET price = 600.00
WHERE book_title = 'Гордость и предубеждение';

UPDATE books
SET price = 550.00
WHERE book_title = '451 градус по Фаренгейту';

UPDATE books
SET price = 480.00
WHERE book_title = 'Идиот';

SELECT
  AVG(price) AS average_price,
  MIN(price) AS minimum_price,
  MAX(price) AS maximum_price
FROM books;

SELECT  a.author_name,
  COUNT  (ab.book_id) AS book_count
FROM   authors a
JOIN   authors_books ab ON a.author_id = ab.author_id
GROUP BY  a.author_name
ORDER BY  book_count;

SELECT  a.author_name,
  COUNT  (b.book_id) AS book_count,
  AVG    (b.price)  AS avg_price
FROM   authors a
JOIN   authors_books ab ON a.author_id = ab.author_id
JOIN   books b ON ab.book_id = b.book_id
GROUP BY  a.author_name
ORDER BY  book_count;

INSERT INTO authors (author_name)
VALUES ('AUTOR1'),
       ('AUTOR2');

SELECT a.author_name
FROM authors a
LEFT JOIN authors_books ab ON a.author_id = ab.author_id
WHERE ab.book_id IS NULL;

SELECT a.author_name
FROM authors a
LEFT JOIN authors_books ab ON a.author_id = ab.author_id
GROUP BY a.author_name
HAVING COUNT(ab.book_id) = 0;