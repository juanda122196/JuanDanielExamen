#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

    CREATE USER postgres PASSWORD 'hola12345';

    CREATE DATABASE juanda1221-examen OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE juanda1221-examen TO admin;

EOSQL
