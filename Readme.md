# Biblioteka – Sistem za Upravljanje Knjigama

## Opis projekta
Ovaj projekat je jednostavan sistem za upravljanje knjigama u biblioteci.  
Omogućava praćenje različitih tipova knjiga (obične i rijetke), izračunavanje njihove vrijednosti, praćenje statusa (npr. posuđena, rezervisana) i pretragu po ISBN-u.  
Sistem koristi **HashMap** za organizaciju knjiga po njihovom ISBN broju.

## Funkcionalnosti
- Kreiranje različitih tipova knjiga:
  - **Obična knjiga** – standardna knjiga sa osnovnom vrijednošću.
  - **Rijetka knjiga** – specijalna knjiga sa statusom (posuđena, rezervisana itd.)
- Praćenje statusa knjiga preko interfejsa `Status`.
- Izračunavanje vrijednosti knjige (`izracunajVrijednost()` metoda).
- Pretraga knjige po ISBN-u.
- Ispis svih knjiga u biblioteci sa detaljima:
  - ISBN
  - Tip knjige (Obična / Rijetka)
  - Status (ako je primjenjivo)
  - Vrijednost
- Izračunavanje ukupne vrijednosti svih knjiga u biblioteci.

## Tehnologije i alati
- **Java 17+** – programski jezik
- **JUnit 4** – framework za testiranje
- **Git** – kontrola verzija
- **GitHub** – hosting repozitorija
- **IntelliJ IDEA** – razvojno okruženje (IDE)
- **HashMap** – za efikasno skladištenje i pretragu knjiga

## Struktura projekta
- `Knjiga` – apstraktna klasa koja predstavlja osnovu knjige
- `ObicnaKnjiga` – nasljeđuje `Knjiga`
- `RijetkaKnjiga` – nasljeđuje `Knjiga` i implementira interfejs `Status`
- `Status` – interfejs za praćenje statusa knjige
- `Main` – klasa koja demonstrira kreiranje, ažuriranje i pretragu knjiga
- `KnjigaTest` – JUnit testovi za provjeru funkcionalnosti

## Kako pokrenuti
1. Klonirati repozitorij:
```bash
git clone https://github.com/miirzoni/Sistem-za-Upravljanje-Knjigama-u-Biblioteci.git
