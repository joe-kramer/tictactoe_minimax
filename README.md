# _Tic Tac Toe - minimax w/ alpha-beta pruning_

#### By _**Joe Kramer**_

## Description

_An unbeatable game of tic tac toe built using AI algorithm minimax and alpha-beta pruning_

## Puesdo code

* _function minimax(node, depth, maximizingPlayerTurn) -- (returns terminal value, returns best value for max, or returns best value for min)_
* _base case (needed because minimax based off recursion)_
* _if depth = 0 or node is terminal node { return the heuristic value of node }_
* _if maximizingPlayerTurn = true { bestValue = -infinity; foreach(child : node) { val = minimax(child, depth - 1, false) } }_
* _if maximizingPlayerTurn = false { bestValue = infinity }_

<!-- ## Specs
* _See a list of all barbers_
* _Select a barber and see their details, and list of clients that belong to them_
* _Need to add new barbers to system_
* _Need to update barbers details_
* _Need to add new clients to barber_
* _Need to update client and styliest details_
* _Delete client and barber_

## Database Setup
* _In PSQL_
* _CREATE DATABASE hair_salon;_
* _\c hair_salon;_
* _CREATE TABLE stylists (id serial PRIMARY KEY, name varchar, details varchar);_
* _CREATE TABLE clients (id serial PRIMARY KEY, stylistId int, name varchar, details varchar);_ -->

## Technologies Used

_Java_

Copyright (c) 2017 **_Joe Kramer_**
