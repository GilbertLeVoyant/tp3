# Compte-rendu TP3 Introduction GIT

Faute de personnes pouvant faire le TP3 avec moi, je le ferais seul.  J'ai donc créer un second compte GitHub afin de pouvoir réaliser ce TP.

## Partie 1

J'ai bien créer un repo TP3 et j'ai partagé l'accès avec mon second compte (qui est lui même sur un second ordinateur).
**Arthos** est mon ordinateur **principal**
**Porthos** est mon ordinateur **secondaire**

Du côté de Porthos, j'ai copié l'ensemble du TP2 dans le TP3 (sans le dossier `.git`).
Puis j'ai add tous les fichiers, fait un commit puis push.
Sur mon ordinateur principal, j'ai pu faire `git pull` et j'ai récupéré tous mon travail .

## Partie 2

J'ai réalisé toutes les étapes demandés et j'arrive bien au résultat suivant :

    Test Portefeuille transfertDevise        ... OK
    Test Portefeuille achatDevise            ... OK
    Test CryptoMarche capitalEnEuros         ... OK
    Test CryptoMarche capitalMonneaie        ... OK

## Partie 3

Pour l'instant nous avons que la branche **main**  mais nous voulons créer une seconde branche pour y réaliser un test.
Voici pour l'instant le log de notre repo :

    git log --graph --oneline --all --decorate --topo-order
    * 28fb134 (HEAD -> main, origin/main, origin/HEAD) Correction bug CryptoMarche.java
    * e3a90fc Code Portefeuille.java complété
    * 5e5c9d3 Programme CryptoMarche.java complété
    * 8021129 Ajout de 3 programmes Java
    * 25df66b Copie du TP2 dans le TP3 ormis le README.md
<br/>
<br/>

`git checkout -b test` qui permet de créer et switcher sur la branche **test**
L’option `-b` nous permet de dire à `checkout` que nous allons créer cette nouvelle branche. `checkout` nous fait changer de branche et aller dans la branche **test**.

Maintenant, quand on est dans la branche **test**, tous se qu'on ajoute n'est pas dans la branche **main**.
Donc le fichier test.txt est seulement visible dans la branche **test**.
Si nous voulons ajouter le contenu de **test** dans le main, on fait la commande : `git merge test` dans le **main**.

J'ai ensuite répéter le même procédé pour faire l'exercice et j'ai réussi à créer deux Cryptomonnaie différente sur deux branches différentes puis fusionner ces deux branches.
