# Oblig 3 v2
Software Engineering 2021
Gruppe: Fryderyk Roszuk og Christoffer Olaussen

#Forklaring av Oblig
1. Vi la inn filene fra Oblig 2 prosjektet (Christoffer sitt prosjekt)

2. Vi la til en ny workflow i Github actions som støttet Java med Maven. Vi fikk først en feil der Java versjonen ikke stemte, da commitet vi en endring hvor vi endret Java versjon 11 til 17 i maven.yml filen.

3. Vi la til en ny test i Intellj prosjektet å commitet og pushet derifra for å sjekke om Github actions kjørte testene automatisk.

4. Vi slet med å få testene til å kjøre etter vi opprettet og endret workflow, men det fikk vi fikset ved å fjerne testng dependencyen og la til junit-jupiter og surefire plugin.
