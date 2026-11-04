# INF4067 — Devoir 1 : principes SOLID

Ce projet présente des exemples Java illustrant les cinq principes SOLID. Chaque principe est organisé dans son propre package sous `src/main/java/inf4067/solid`.

## Prérequis

- JDK 17 ou version ultérieure
- Maven

## Exemples

| Principe | Package | Exemple |
|---|---|---|
| **SRP** — responsabilité unique | `srp` | `BookSRP` représente les données du livre. `BookPrinter`, `BookSaver` et `BookBusinessLogic` séparent respectivement l’affichage, la sauvegarde et la logique métier. |
| **OCP** — ouvert/fermé | `ocp` | `Shape` définit le calcul d’aire. `Circle` et `Rectangle` fournissent leurs calculs, utilisés par `AreaCalculator2`. |
| **LSP** — substitution de Liskov | `lsp` | `Square` et `Rectangle` implémentent `Shape` et peuvent être utilisés via cette abstraction. |
| **ISP** — ségrégation des interfaces | `isp` | `Workable` et `Eatable` séparent les capacités : un humain peut travailler et manger, tandis qu’un robot n’implémente que `Workable`. |
| **DIP** — inversion des dépendances | `dip` | `OrderProcessor` dépend de l’interface `Database`, implémentée par `MySQLDatabase` et `MongoDBDatabase`. |

Chaque exemple dispose d’une classe `main` pour illustrer son exécution :

- `inf4067.solid.srp.Main`
- `inf4067.solid.ocp.Main`
- `inf4067.solid.lsp.Mainlsp2`
- `inf4067.solid.isp.MainISP`
- `inf4067.solid.dip.Main`

## Tests unitaires

Exécuter les tests avec Maven depuis la racine du projet :

```bash
mvn test
```

Les tests utilisent JUnit 5. Les tests unitaires présents vérifient actuellement l’exemple SRP : les données du livre, son affichage à l’écran et en HTML, les opérations de sauvegarde ainsi que la logique métier.