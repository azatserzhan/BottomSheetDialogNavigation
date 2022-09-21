# BottomSheetDialogNavigation
Android. Навигация внутри Bottom Sheet Dialog

Более подробно описано тут:
https://medium.com/@azatserzhan/bottom-sheet-dialog-navigation-746cc2b2ba0f

<b>Хотелки</b>

<ul>
     <li>Навигация должна быть внутри диалога.</li>
     <li>Навигация должна начинаться с любого фрагмента. Гена</li>
     <li>Передача аргументов для начального и любого фрагмента.</li>
     <li>Переходить с FragmenA на FragmentB по клику и наоборот.</li>
   </ul>

<b>Трудности</b>

Если используете библиотеку Navigation, то обязательно нужно задавать startDestination. Предположим startDestination = “FragmentA”, тогда придется показать FragmentA потом навигировать в FragmentB.

Для фрагмента, который указан в качестве первого, не понятно как передавать аргументы.

<b>Решение</b>

Создавать graph программно и назначать его в созданный navController. Таким образом можно задавать программно startDestination(Начальный фрагмент) и передавать для него аргументы.

<b>Алгоритм действий будет таким:</b>

Шаг 1. MainActivity запускает ContainerBottomSheetDialog который имеет внутри FragmentContainerView.

Шаг 2. Cоздаем граф программно(с указанием StartDestination и аргументами) и присваиваем в NavHost у FragmentContainerView.
