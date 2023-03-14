BEGIN TRANSACTION;

DROP TABLE IF EXISTS languages;
DROP SEQUENCE IF EXISTS language_id;


CREATE SEQUENCE language_id
    INCREMENT BY 1
    START WITH 001
    NO MAXVALUE;


CREATE TABLE languages (
    language_id int NOT NULL DEFAULT nextval('language_id'),
    language_name varchar(30) NOT NULL,
    lyrics varchar(500) NOT NULL,
    CONSTRAINT PK_languages PRIMARY KEY (language_id)
);


INSERT INTO languages (language_name, lyrics) VALUES
('English', 'Happy birthday to you! Happy birthday to you! Happy birthday dear ! Happy birthday to you!'),
('Spanish', 'Feliz cumpleaños a ti feliz cumpleaños a ti feliz cumpleaños ! feliz cumpleaños a ti.'),
('Korean', '생일 축하합니다 생일 축하합니다 사랑하는 씨 생일 축하합니다'),
('Arabic', 'سنة حلوة يا جميل سنة حلوة يا جميل سنة حلوة يا سنة حلوة يا جميل'),
('French', 'Joyeux anniversaire Joyeux anniversaire Joyeux anniversaire ! Joyeux anniversaire'),
('Mandarin (simplified)', '生日快乐 祝你生日快乐 祝你生日快乐 祝你生日快乐 祝你永远快乐'),
('Bengali', 'Shuvo jonmodin tomay Shuvo jonmodin tomay Shuvo jonmodin ! Shuvo jonmodin tomay'),
('Russian', 'С днем рожденья тебя С днем рожденья тебя! С днем рожденья ! С днем рожденья тебя!'),
('Portugese', 'Parabéns pra você, Nesta data querida. Muitas felicidades, Muitos anos de vida. Hoje é dia de festa, Cantam as nossas almas. Para o/a menino/a , Uma salva de palmas.'),
('Indonesian', 'Panjang umurnya Panjang umurnya Panjang umurnya Serta mulia Serta mulia Serta mulia Selamat ulang tahun kami ucapkan Semoga panjang umur kami kan doakan Selamat sejahtera sehat sentosa Selamat panjang umur dan bahagia');


COMMIT;