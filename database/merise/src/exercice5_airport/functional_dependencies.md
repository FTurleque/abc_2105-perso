Dépendances fonctionnelles :  

- plane_registration_number => plane_purchase_date, plane_name, plane_constructor_name, plane_engine_power, plane_place_number.  
- owner_id => owner_type, owner_society_name, owner_lastname, owner_firstname, owner_nb_street, owner_street, owner_postal_code, owner_city, owner_phone_number, plane_registration_number, plane_purchase_date, plane_name, plane_constructor_name, plane_engine_power, plane_place_number.  
- mechanic_id => mechanic_role, mechanic_firstname, mechanic_lastname, mechanic_nb_street, mechanic_street, mechanic_postal_code, mechanic_city, mechanic_phone_number, mechanic_hability.  
- intervention_id => intervention_object, intervention_date, intervention_time, plane_registration_number => plane_purchase_date, plane_name, plane_constructor_name, plane_engine_power, plane_place_number, owner_id.  
- pilot_id => pilot_firstname, pilot_lastname, pilot_nb_street, pilot_street, pilot_postal_code, pilot_city, pilot_phone_number.  
- licence_number => licence_plane_hability, number_of_flights, plane_registration_number, plane_purchase_date, plane_name, plane_constructor_name, plane_engine_power, plane_place_number, owner_id, pilot_id, pilot_firstname, pilot_lastname, pilot_nb_street, pilot_street, pilot_postal_code, pilot_city, pilot_phone_number.  
_________
Dépendances fonctionnelles composées : 

- mechanic_id, intervention_id => mechanic_role, mechanic_firstname, mechanic_lastname, mechanic_nb_street, mechanic_street, mechanic_postal_code, mechanic_city, mechanic_phone_number, mechanic_hability, intervention_object, intervention_date, intervention_time, plane_registration_number, plane_purchase_date, plane_name, plane_constructor_name, plane_engine_power, plane_place_number, owner_id.  