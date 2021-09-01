Dépendances fonctionnelles :  
- plane_ registration_number => plane_purchase_date, plane _name, plane _constructor_name, plane_ engine_power, plane_place_number, owner_id.  
- owner_id => owner_type, owner_lastname, owner_firdtname, owner_address, owner_phone_number.  
- mechanic_id => mechanic_role, mechanic_firstname, mechanic_lastname, mechanic_address, mechanic_phone_number, mechanic_hability.  
- intervention_id => intervention_object, intervention_date, intervention_time, plane_ registration_number.  
- pilot_id => pilot_firstname, pilot_lastname, pilot_phone_number, pilot_licence_number, pilot_ number_of_flights, pilot_hability.  
_________
Dépendances fonctionnelles composées :  
- plane_ registration_number, pilot_id => plane_purchase_date, plane _name, plane _constructor_name, plane_ engine_power, plane_place_number, owner_id, pilot_firstname, pilot_lastname, pilot_phone_number, pilot_licence_number, pilot_ number_of_flights, pilot_hability.  
- mechanic_id, intervention_id => intervention_object, intervention_date, intervention_time, plane_ registration_number, mechanic_role, mechanic_firstname, mechanic_lastname, mechanic_address, mechanic_phone_number, mechanic_hability.  