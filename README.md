# UniStay


## 📌 Descrizione del Progetto

UniStay è una piattaforma di prenotazione di alloggi pensata principalmente per studenti universitari e giovani utenti che desiderano trovare sistemazioni in modo semplice, intuitivo e accessibile.

Il progetto è stato sviluppato da:
- Angelo Perrotti
- Matteo Reggio
- Domenico Russo

L’obiettivo del progetto è quello di modellare un sistema realistico di gestione degli alloggi, mantenendo un’architettura software chiara, organizzata e facilmente estendibile.

---

# 🏗️ Architettura del Progetto

Il sistema è stato strutturato secondo una separazione architetturale di tipo MVC/BCE:

## 📂 Package Model

Contiene tutte le entity principali del dominio:

- User
- Host
- Guest
- Listing
- Booking
- Payment
- Review

Queste classi rappresentano gli oggetti reali del sistema e le relazioni tra essi.

---

## 📂 Package Controller

Contiene i controller che gestiscono la logica applicativa:

- UserController
- ListingController
- BookingController

I controller agiscono da intermediari tra GUI e Model.

---

## 📂 Package GUI

Contiene le prime schermate Swing dell’applicazione:

- LoginView
- ListingView
- BookingView

La GUI rappresenta una prima bozza dell’interfaccia utente prevista per il progetto finale.

---

# ⚙️ Funzionalità Implementate

Attualmente il sistema permette di:

- effettuare il login;
- simulare la visualizzazione degli annunci;
- simulare una prenotazione;
- gestire utenti Host e Guest;
- gestire lo stato delle prenotazioni;
- simulare il pagamento associato a una prenotazione.

I dati vengono attualmente gestiti in memoria e non tramite database.

---

# 📊 Diagramma UML

Il progetto include:
- diagramma UML del dominio;
- diagramma UML di dettaglio;
- separazione tra GUI, Controller e Model.

---

# 🖥️ Tecnologie Utilizzate

- Java
- Java Swing
- Maven
- Visual Paradigm
- GitHub

---

# 🚧 Stato Attuale del Progetto

Questa versione rappresenta il secondo homework del progetto.

Sono stati implementati:
- separazione architetturale dei package;
- prime schermate GUI;
- interazione GUI → Controller → Model.

Non sono ancora presenti:
- database;
- persistenza dei dati;
- JDBC;
- DAO.

Questi elementi verranno introdotti nelle fasi successive del progetto.

---

# 👥 Team

- Angelo Perrotti
- Matteo Reggio
- Domenico Russo
