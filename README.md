# Wzorce projektowe

Wzorce opracowane na podstawie książki "Rusz głową! Wzorce projektowe".
 
## Wzorzec Strategia (*Strategy*)

Definiuje rodziny algorytmów, dokonuje ich hermetyzacji (tworzy z nich osobne klasy) i powoduje, że są one w pełni wymienne. Wzorzec pozwala na modyfikację danego algorytmu niezależnie korzystających z nich klientów.

Wzorzec został wytłumaczony na przykładzie skomponowania różnych rodzajów kaczek z klas implementujących interfejsy `KwakanieInterfejs` i `LatanieInterfejs`. 

### Wykorzystywane reguły programowania obiektowego

* **Poddawaj hermetyzacji to, co się zmienia.**  
  Dokonaliśmy hermetyzacji kodu dzięki temu, że każde zachowanie posiada własną klasę. Ponadto dzięki temu, że użyliśmy kompozycji, a nie dziedziczenia wprowadzane modyfikacje nie pociągną za sobą zmian kodu w kolejnych podklasach.  
* **Skoncentruj się na tworzeniu interfejsów, a nie implementacji.**  
  Do reprezentacji różnych zachowań kaczki wykorzystuję interfejsy `KwakanieInterfejs` i `LatanieInterfejs`. Dzięki nim tworzę zestawy klas, które reprezentują szereg zachowań. Potem z tych klas komponuję kaczkę poprzez odwołanie się do interfejsów, a nie bezpośrednio do klas.  
* **Przedkładaj kompozycję nad dziedziczenie.**  
  Kaczki zamiast dziedziczyć po wybranych klasach otrzymują określone zachowania poprzez kompozycję. Pola klasy odwołują się bezpośrednio do interfejsów, w ten sposób można bezpośrenio odwoływać się do klas implementujących te interfejsy i skomponować kaczkę z "klocków", czyli klas reprezentujących określone zachowania.   

## Wzorzec Obserwator (*Observer*)

Definiuje między obiektami relację jeden-do-wielu w taki sposób, że kiedy wybrany obiekt zmienia swój stan, wszystkie jego obiekty zależne zostają o tym powiadomione i automatycznie zaktualizowane. 

### Wykorzystywane reguły programowania obiektowego 

* **Poddawaj hermetyzacji to, co się zmienia.**  
  Elementami, które we wzorcu Obserwator podlegają zmianom są: stan obiektu obserwowanego oraz ilość i rodzaj obiektów obserwujących. Zgodznie z założeniami wzorca możesz modyfikować obiekty, które są zależne od stanu obiektu obserwowanego bez konieczności modyfikacji samego obiektu obserwowanego. 
* **Skoncentruj się na tworzeniu interfejsów, a nie implementacji.**  
  Zarówno obiekt obserwowany Podmiot (*Subject*) jak i obiekty obserwujące wykorzystują interfejsy. Obiekt obserwowany śledzi wszystkie obiekty, które mają zaimplementowany interfejs Obserwator, podczas gdy obiekty obserwujące do rejestracji, usuwania z listy zarejestrowanych obiektów oraz do otrzymywania powiadomień wykorzystują interfejs Podmiot. 
* **Przedkładaj kompozycję nad dziedziczenie.**  
  Wzorzec Obserwator wykorzystuje zasadę kompozycji do tworzenia dowolnej liczby obiektów obserwujących powiązanych z danym obiektem obserwowanym. Te relacje nie są tworzone poprzez mechanizm dziedziczenia tylko poprzez kompozycję. 
* **Staraj się tworzyć projekty, w których obiekty są ze sobą luźno powiązane i, o ile możliwe, nie oddziałują na siebie wzajemnie.**  
  Jedyną informacją, jaką obiekt obserwowany posiada o obiekcie obserwującym jest to, że obiekt obserwujący posiada pewien określony interfejs.  
  Nowych obserwatorów możemy dodawać w dowolnym momencie i nie wymaga to modyfikacji obiektu obserwowanego.  
  Zarówno obiekty obserwowane jak i obiekty obserwujące mogą być niezależnie od siebie wielokrotnie wykorzystywane i modyfikowane bez żadnego wpływu na siebie (o ile poprawnie implementują interfejsy).
  
## Wzorzec Dekorator (*Decorator*)

Pozwala na dynamiczne przydzielanie danemu obiektowi nowych zachowań. Dekoratory dają elastyczność podobną do tej, jaką daje dziedziczenie, oferując jednak w zamian znacznie rozszerzoną funkcjonalność.

### Wykorzystywane reguły programowania obiektowego

* **Zasada otwarte-zamknięte** (*OCP - Open-Closed Principle*)  
  *Klasy powinny być otwarte na rozbudowę, ale zamknięte na modyfikacje.* 
  
## Wzorzec Metoda Wytwórcza (*Factory Method*)

Definiuje interfejs pozwalający na tworzenie obiektów, ale pozwala klasom podrzędnym decydować, jakiej klasy obiekt zostanie utworzony. Wzorzec Metoda Wytwórcza przekazuje odpowiedzialność za tworzenie obiektów do klas podrzędnych. 

### Wykorzystywane reguły programowania obiektowego

* **Reguła odwrócenia zależności** (*DIP - Dependency Inversion Principle*)  
*Uzależniaj kod od abstrakcji, a nie od konkretnych klas.* Albo, jak stoi w "Zwinnym wytwarzaniu oprogramowania":  
  *Moduły wysokopoziomowe nie powinny zależeć od modułów niskopoziomowych. I jedne, i drugie powinny zależeć od abstrakcji.*  
Prostsza implementacja tego kodu nie korzystająca z Metody Wytwórczej uzależniłaby tworzenie obiektów konkretnych produktów od klasy `Pizzeria`. Klasy konkretnych produktów to *moduły niskopoziomowe*, podczas gdy klasa `Pizzeria` jest *modułem wysokopoziomowym*, ponieważ jej zachowanie jest determinowane generowaniem składników niskiego poziomu.  
Przy zastosowaniu wzorca Metody Wytwórczej konkretne klasy reprezentujące różne gatunki pizzy zostały "uzależnione" od klasy abstrakcyjnej `Pizza`. Jednocześnie konkretne fabryki (`AmerykanskaPizzeria` oraz `WloskaPizzeria`) wykorzystują klasę abstrakcyjną `Pizza` do zwracania obiektów konkretnych produktów. Czyli uniezależniliśmy od siebie składniki niskopoziomowe i wysokopoziomowe. Teraz zależą one od *abstrakcji* jaką jest klasa abstrakcyjna `Pizza`.
  
