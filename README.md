# design-patterns
Learning design patterns using Head First book <br><br>

### Strategy
**Паттерн Стратегия** определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
Он позволяет модифицировать алгоритмы независимо от их использования на стороне клиента.  

##### Принцип проектирования
> **Формулировка**: выделите аспекты приложения, которые могут изменяться, и отделите их от тех, которые всегда остаются постоянными.  
> **Альтернативное формулировка**: выделите переменные составляющие и инкапсулируйте их, чтобы позднее можно было их изменять или 
расширять без воздействия на постоянные составляющие.  
> **Зачем**: меньше непредвиденных последствий от изменения кода, большая гибкость архитектуры.  


##### Принцип проектирования
> **Формулировка**: Программируйте на уровне интерфейса, а не на уровне реализации.  
> **Зачем**: отсутствие зависимости от конкретной реализации, возможность изменения поведения во время выполнения.  


##### Принцип проектирования
> **Формулировка**: Отдавайте предпочтение композиции перед наследованием.  
> **Зачем**: гибкость расширения - поведение не наследуется, а предоставляется нужным объектом.

###Observer
**Паттерн Наблюдатель** определяет отношение "один-ко-многим" между объектами таким образом, 
что при изменении состояния одного объекта происходит автоматическое оповещение и обновление
всех зависимых объектов.

##### Принцип проектирования
> **Формулировка**: Стремитесь к слабой связанности взаимодействующих объектов.
> **Зачем**: адаптация архитектуры к изменениям благодаря минимальным зависимостям 
> между объектами.
> 
> 
