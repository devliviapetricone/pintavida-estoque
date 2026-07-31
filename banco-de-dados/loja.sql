-- ============================================================
--  PintaVida Papelaria - Script SQL para phpMyAdmin / MySQL
--  Execute este arquivo no phpMyAdmin para criar o banco
-- ============================================================

CREATE DATABASE IF NOT EXISTS loja
  CHARACTER SET utf8mb4
  COLLATE utf8mb4_unicode_ci;

USE loja;

CREATE TABLE IF NOT EXISTS produto (
  id          BIGINT       NOT NULL AUTO_INCREMENT,
  nomeProduto VARCHAR(255) NOT NULL,
  marca       VARCHAR(255) NOT NULL,
  categoria   VARCHAR(255) NOT NULL,
  preco       DOUBLE       NOT NULL,
  quantidade  INT          NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

INSERT INTO produto (nomeProduto, marca, categoria, preco, quantidade) VALUES
  ('Lápis de Cor 24 Cores',       'Faber-Castell', 'Lápis e Canetas', 29.90,  50),
  ('Caneta Esferográfica Azul',   'Bic',            'Lápis e Canetas',  1.99, 200),
  ('Caderno Espiral A4 96fls',    'Tilibra',        'Cadernos',        18.90,  80),
  ('Tinta Acrílica Kit 12 Cores', 'Corfix',         'Pintura',         54.90,  30),
  ('Mochila Escolar Basic',       'Capricho',       'Escolar',         89.90,  25),
  ('Pincel Chato Nº 10',          'Tigre',          'Pintura',          8.50,  60),
  ('Borracha Branca Grande',      'Staedtler',      'Escolar',          3.50, 150),
  ('Régua 30cm Transparente',     'Maped',          'Escolar',          4.90, 120),
  ('Sketchbook A4 120g',          'Canson',         'Cadernos',        42.00,  40),
  ('Marca-Texto Kit 6 Cores',     'Stabilo',        'Lápis e Canetas', 19.90,  70);
