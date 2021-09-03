Dépendances fonctionnelles :  
- book_isbn --> book_title, book_price, book_ awarded.  
- author_id --> author_firstname, author_lastname, author_nickname.  
- bookseller_id --> bookseller_firstname, bookseller_lastname, bookseller_nb_street, bookseller_street, bookseller_postal_code, bookseller_city.  
- edition_number --> edition_date, edition_copy_number.
________________
Dépendances fonctionnelles composées :  
- book_isbn, bookseller_id --> book_title, book_price, book_ awarded, edition_number, bookseller_firstname, bookseller_lastname, bookseller_nb_street, bookseller_street, bookseller_postal_code, bookseller_city.  
- book_isbn, author_id --> book_title, book_price, book_ awarded, edition_number, author_firstname, author_lastname, author_nickname.  
- book_isbn, edition_number --> book_title, book_price, book_ awarded, edition_date, edition_copy_number.
