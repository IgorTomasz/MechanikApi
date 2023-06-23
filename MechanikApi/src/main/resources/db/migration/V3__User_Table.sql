Create TABLE User_roles(
    user_role_id int IDENTITY (1,1) NOT NULL ,
    name varchar(20) NOT NULL ,
    CONSTRAINT User_role_pk PRIMARY KEY (user_role_id)
)

Create TABLE User_details(
    id int IDENTITY(1,1) NOT NULL ,
    user_name varchar(250) NOT NULL ,
    password varchar(250) NOT NULL ,
    user_role_id int NOT NULL ,
    CONSTRAINT User_pk PRIMARY KEY (id)
    )

ALTER TABLE User_details ADD CONSTRAINT User_role_in_user
    FOREIGN KEY (user_role_id)
        REFERENCES User_roles (user_role_id);

INSERT INTO User_roles (name) VALUES ('MANAGER');
INSERT INTO User_roles (name) VALUES ('MECHANIK');

INSERT INTO User_details (user_name, password, user_role_id) VALUES ('jan','abc123',1);
Insert Into User_details (user_name, password, user_role_id) VALUES ('kacper','qaz123',2);