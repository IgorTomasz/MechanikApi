-- Insert into Klient
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (1, 'Jan', 'Kowalski', 123456789);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (2, 'Adam', 'Nowak', 234567890);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (3, 'Marek', 'Lewandowski', 345678901);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (4, 'Piotr', 'Zieliński', 456789012);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (5, 'Tomasz', 'Piatek', 567890123);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (6, 'Robert', 'Szczęsny', 678901234);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (7, 'Lukasz', 'Grosicki', 789012345);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (8, 'Michał', 'Pazdan', 890123456);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (9, 'Krzysztof', 'Błaszczykowski', 901234567);
INSERT INTO Klient (klient_id, first_name, last_name, nr_tel) VALUES (10, 'Jakub', 'Wawrzyniak', 012345678);

-- Insert into Mechanik
INSERT INTO Mechanik (mechanik_id, first_name, last_name, nr_tel, stawka_godz) VALUES (1, 'Adam', 'Nowak', 987654321,21.00);
INSERT INTO Mechanik (mechanik_id, first_name, last_name, nr_tel, stawka_godz) VALUES (2, 'Kamil', 'Kowalski', 876543210,21.00);
INSERT INTO Mechanik (mechanik_id, first_name, last_name, nr_tel, stawka_godz) VALUES (3, 'Grzegorz', 'Brzęczyszczykiewicz', 765432109,21.00);
INSERT INTO Mechanik (mechanik_id, first_name, last_name, nr_tel, stawka_godz) VALUES (4, 'Mariusz', 'Pudzianowski', 654321098,21.00);
INSERT INTO Mechanik (mechanik_id, first_name, last_name, nr_tel, stawka_godz) VALUES (5, 'Artur', 'Szpilka', 543210987,21.00);

-- Insert into Samochod
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (1, 'Toyota', 'Corolla', '2023-06-01', 'WE1234A', 1);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (2, 'Ford', 'Focus', '2023-06-02', 'WE2345B', 2);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (3, 'Honda', 'Civic', '2023-06-03', 'WE3456C', 3);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (4, 'Volkswagen', 'Golf', '2023-06-04', 'WE4567D', 4);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (5, 'Audi', 'A3', '2023-06-05', 'WE5678E', 5);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (6, 'BMW', '3 Series', '2023-06-06', 'WE6789F', 6);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (7, 'Mercedes', 'C-Class', '2023-06-07', 'WE7890G', 7);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (8, 'Peugeot', '208', '2023-06-08', 'WE8901H', 8);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (9, 'Hyundai', 'i30', '2023-06-09', 'WE9012I', 9);
INSERT INTO Samochod (samochod_id, marka, model, data_rejestracji, nr_rej, klient_id) VALUES (10, 'Kia', 'Ceed', '2023-06-10', 'WE0123J', 10);

-- Insert into s_status
insert into s_status (status_id, name) values (1,'Zaplanowana');
insert into s_status (status_id, name) values (2,'W trakcie');
insert into s_status (status_id, name) values (3,'Zakonczona');

-- Wstawianie do Wizyta
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (1, 1, 3, '2023-05-20', '2023-05-20', 'Wymiana opon', 1);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (2, 2, 3, '2023-05-21', '2023-05-23', 'Wymiana oleju', 2);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (3, 1, 3, '2023-05-22', '2023-05-27', 'Naprawa hamulców', 3);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (4, 3, 3, '2023-05-23', '2023-05-24', 'Wymiana opon', 4);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (5, 2, 3, '2023-05-24', '2023-05-27', 'Wymiana oleju', 5);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (6, 4, 3, '2023-05-25', '2023-05-30', 'Naprawa hamulców', 1);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (7, 3, 3, '2023-05-26', '2023-05-28', 'Wymiana opon', 2);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (8, 1, 3, '2023-05-27', '2023-06-01', 'Wymiana oleju', 3);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (9, 5, 3, '2023-05-28', '2023-06-02', 'Naprawa hamulców', 4);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (10, 4, 3, '2023-05-29', '2023-05-31', 'Wymiana opon', 5);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (11, 6, 3, '2023-05-30', '2023-06-01', 'Wymiana opon', 1);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (12, 7, 3, '2023-05-31', '2023-06-06', 'Naprawa zawieszenia', 2);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (13, 8, 3, '2023-06-01', '2023-05-03', 'Wymiana filtrów', 3);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (14, 9, 3, '2023-06-02', '2023-06-07', 'Wymiana płynów eksploatacyjnych', 4);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (15, 10, 2, '2023-06-03', NULL, 'Naprawa silnika', 5);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (16, 6, 2, '2023-06-04', NULL, 'Naprawa układu chłodzenia', 1);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (17, 7, 2, '2023-06-05', NULL, 'Naprawa układu kierowniczego', 2);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (18, 8, 2, '2023-06-06', NULL, 'Wymiana oleju', 3);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (19, 9, 1, '2023-06-07', NULL, 'Naprawa hamulców', 4);
INSERT INTO Wizyta (wizyta_id, samochod_id, status_id, data_przyjecia, data_zakonczenia, opis, mechanik_id) VALUES (20, 10, 1, '2023-06-08', NULL, 'Diagnostyka', 5);