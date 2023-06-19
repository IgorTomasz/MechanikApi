-- Created by Vertabelo (http://vertabelo.com)
-- Last modification date: 2023-06-08 11:38:39.273

-- tables
-- Table: Klient
CREATE TABLE Klient (
                        klient_id int IDENTITY(1,1) NOT NULL,
                        first_name varchar(15)  NOT NULL,
                        last_name varchar(25)  NOT NULL,
                        nr_tel int  NOT NULL,
                        CONSTRAINT Klient_pk PRIMARY KEY  (klient_id)
);

-- Table: Mechanik
CREATE TABLE Mechanik (
                          mechanik_id int IDENTITY(1,1) NOT NULL,
                          first_name varchar(15)  NOT NULL,
                          last_name varchar(25)  NOT NULL,
                          nr_tel int  NOT NULL,
                          stawka_godz NUMERIC(5,2),
                            CONSTRAINT Mechanik_pk PRIMARY KEY  (mechanik_id)
);

-- Table: Samochod
CREATE TABLE Samochod (
                          samochod_id int IDENTITY(1,1) NOT NULL,
                          marka varchar(20)  NOT NULL,
                          model varchar(20)  NOT NULL,
                          data_rejestracji date  NOT NULL,
                          Nr_rej varchar(7)  NOT NULL,
                          klient_id int  NOT NULL,
                          CONSTRAINT Samochod_pk PRIMARY KEY  (samochod_id)
);

-- Table: s_status
CREATE TABLE s_status (
                                        status_id int  NOT NULL,
                                        name varchar(15)  NOT NULL,
                                        CONSTRAINT s_status_pk PRIMARY KEY  (status_id)
);

-- Table: Wizyta
CREATE TABLE Wizyta (
                        wizyta_id int IDENTITY(1,1) NOT NULL,
                        samochod_id int  NOT NULL,
                        status_id int  NOT NULL,
                        data_przyjecia date  NOT NULL,
                        data_zakonczenia date  NULL,
                        opis varchar(250)  NOT NULL,
                        mechanik_id int NULL,
                        CONSTRAINT Wizyta_pk PRIMARY KEY  (wizyta_id)
);



-- foreign keys
-- Reference: Samochod_Klient (table: Samochod)
ALTER TABLE Samochod ADD CONSTRAINT Samochod_Klient
    FOREIGN KEY (klient_id)
        REFERENCES Klient (klient_id);

-- Reference: Wizyta_Mechanik (table: Wizyta)
ALTER TABLE Wizyta ADD CONSTRAINT Wizyta_Mechanik
    FOREIGN KEY (mechanik_id)
        REFERENCES Mechanik (mechanik_id);

-- Reference: Wizyta_Samochod (table: Wizyta)
ALTER TABLE Wizyta ADD CONSTRAINT Wizyta_Samochod
    FOREIGN KEY (samochod_id)
        REFERENCES Samochod (samochod_id);

-- Reference: Wizyta_s_status (table: Wizyta)
ALTER TABLE Wizyta ADD CONSTRAINT Wizyta_s_status
    FOREIGN KEY (status_id)
        REFERENCES s_status (status_id);

-- End of file.

