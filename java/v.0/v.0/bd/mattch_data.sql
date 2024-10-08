use mattch;

INSERT INTO user (id, username, mail, password) 
VALUES 
(1, 'johndoe1', 'johndoe1@example.com', 'password123'),
(2, 'janedoe2', 'janedoe2@example.com', 'password456'),
(3, 'mike_smith3', 'mike_smith3@example.com', 'password789'),
(4, 'sarah_connor4', 'sarah.connor4@example.com', 'password987'),
(5, 'james_bond5', 'james.bond5@example.com', 'password654'),
(6, 'bruce_wayne6', 'bruce.wayne6@example.com', 'password321'),
(7, 'tony_stark7', 'tony.stark7@example.com', 'password999'),
(8, 'diana_prince8', 'diana.prince8@example.com', 'password555'),
(9, 'clark_kent9', 'clark.kent9@example.com', 'password444'),
(10, 'peter_parker10', 'peter.parker10@example.com', 'password111');


select user.* from user;