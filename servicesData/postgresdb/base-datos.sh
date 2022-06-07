#!/bin/bash
set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" <<-EOSQL

    CREATE USER admin PASSWORD 'admin';

    CREATE DATABASE juanda OWNER admin;
    GRANT ALL PRIVILEGES ON DATABASE juanda TO admin;

EOSQL
