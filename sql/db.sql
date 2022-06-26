CREATE DATABASE workingtime
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

CREATE TABLE users (
                       user_id INT AUTO_INCREMENT,
                       user_name VARCHAR(255),
                       user_surname VARCHAR(255),
                       user_email VARCHAR(255) UNIQUE,
                       user_password VARCHAR (255),
                       PRIMARY KEY(user_id)

);

CREATE TABLE projects (
                          project_id INT AUTO_INCREMENT,
                          project_name VARCHAR(255),
                          project_description VARCHAR(255),
                          primary key (project_id)



);

CREATE TABLE tasks (
                       task_id INT AUTO_INCREMENT,
                       task_name VARCHAR(255),
                       task_description VARCHAR(255),
                       project_id INT,
                       PRIMARY KEY (task_id),
                       FOREIGN KEY (project_id) REFERENCES projects(project_id)



);

CREATE TABLE time (
                      id INT AUTO_INCREMENT,
                      user_id INT,
                      task_id INT,
                      hours LONG
                      PRIMARY KEY (id),
                      FOREIGN KEY (user_id) REFERENCES users(user_id),
                      FOREIGN KEY (task_id) REFERENCES tasks(task_id)

);

INSERT INTO users (userName, userSurname, email, password) VALUES ('Jan', 'Kowalski', 'jan@poczta', 'haslo');

INSERT INTO projects(projectName, projectDescription) VALUES ('patpol', 'duzy klient');

INSERT INTO tasks(taskName, taskDescription, project_id) VALUES ('call', 'rozmowa z klientem',1);
INSERT INTO tasks(taskName, taskDescription, project_id) VALUES ('meet', 'spotkanie z klientem',1);

INSERT INTO time(hours, tasks_id) VALUES (2.5, 1);
INSERT INTO time(hours, tasks_id) VALUES (3, 2);

INSERT INTO projects(projectName, projectDescription) VALUES ('marpol', 'sredni klient');




