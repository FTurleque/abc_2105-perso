USE db_library;

SELECT * FROM db_library.customers;

INSERT INTO books
(
    book_id,
    book_title,
    book_publisher,
    book_author,
    book_purchasedate,
    book_condition,
    customer_id,
)
VALUES
