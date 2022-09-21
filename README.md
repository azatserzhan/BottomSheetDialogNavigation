# BottomSheetDialogNavigation
Android. Навигация внутри Bottom Sheet Dialog

Более подробно описано тут:
https://medium.com/@azatserzhan/bottom-sheet-dialog-navigation-746cc2b2ba0f

Хотелки
Навигация должна быть внутри диалога.
Навигация должна начинаться с любого фрагмента.
Передача аргументов для начального и любого фрагмента.
Переходить с FragmenA на FragmentB по клику и наоборот.
Трудности
Если используете библиотеку Navigation, то обязательно нужно задавать startDestination. Предположим startDestination = “FragmentA”, тогда придется показать FragmentA потом навигировать в FragmentB.

Для фрагмента, который указан в качестве первого, не понятно как передавать аргументы.

Решение
Создавать graph программно и назначать его в созданный navController. Таким образом можно задавать программно startDestination(Начальный фрагмент) и передавать для него аргументы.

Алгоритм действий будет таким:

Шаг 1. MainActivity запускает ContainerBottomSheetDialog который имеет внутри FragmentContainerView.

Шаг 2. Cоздаем граф программно(с указанием StartDestination и аргументами) и присваиваем в NavHost у FragmentContainerView.
