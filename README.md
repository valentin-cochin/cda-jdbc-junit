# cda-jdbc-junit
Exercice on Databases and JUnit

## Enoncé
Pour mon apprentissage, j'ai besoin d'une application qui permet de lister 
les sujets que je vois lors ou en dehors de ma formation.
chaque sujet est forcément dans l'un des états suivant :
- à découvrir
- vue mais revoir absolument
- compris à approfondir si possible
via l'application je peux aussi faire les actions suivantes :
- renseigner la date à laquelle j'ai vu le sujet.
- modifier l'état d'un sujet.
- lister les sujet dans cette ordre 
-- d'abord les sujet vus mais à revoir 
-- puis les sujets à découvrir 
-- puis les sujets compris à approfondir.
Les données doivent être persistées sur une base de données.
- créez une application mavenisée
- avec des tests unitaires qui assure la couverture de 50% du code source
  en utilisant le plugin jacoco. Le build doit échouer en dessous de ce seuil.
- déployez l'application et la base de données sur 2 VM différentes.
