Dépendances fonctionnelles :  
- work_id => work_type, work_title, work_year, work_width, work_height, work_lenght, work_copy_owned, artistic_current_name, museum_id.  
- museum_id => museum_name, museum_city, work_id.  
- artist_id => artist_firstname, artist_lastname, artist_nationality, artist_birthdate, artist_deathdate.  
- artistic_current_name => artistic_current_start, artistic_current_end, artistic_current_description.  
______
Dépendances fonctionnelles composées :  
- work_id, artist_id => work_type, work_title, work_year, work_width, work_height, work_lenght, work_copy_owned, artistic_current_name, museum_id, artist_firstname, artist_lastname, artist_nationality, artist_birthdate, artist_deathdate.  
- artist_id, artistic_current_name => artist_firstname, artist_lastname, artist_nationality, artist_birthdate, artist_deathdate, artistic_current_start, artistic_current_end, artistic_current_description.  