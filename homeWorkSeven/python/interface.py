
class Interface():
    def __init__(self):
        self.user_input = None

    def main_menu(self):
        self.user_input = None
        while self.user_input not in range(1, 10):
            try:
                self.user_input = int(input("Меню выбора: \n" +
                                       "1 - Добавить контакт\n" +
                                       "2 - Удалить контакт\n" +
                                       "3 - Изменить контакт\n" +
                                       "4 - Поиск контакта\n" +
                                       "5 - Показать все контакты\n" +
                                       "6 - Импортировать телефонный справочник\n" +
                                       "7 - Экспортировать телефонный справочник \n" +
                                       "8 - Отчистить телефонный справочник \n" +
                                       "9 - Выход\n" +
                                       "Выберите пункт: "))
            except:
                print("Ошибка введите число!")
                pass
        return self.user_input

    def choose_remove_contact(self):
        self.user_input = None
        while self.user_input not in range(1, 3):
            try:
                self.user_input = int(input("Удаление контакта: \n" +
                "1 - По параметру (Имя/Фамилия/Телефон)\n" +
                "2 - По контакту из списка\n" +
                "Выберите пункт: "))
            except:
                print("Ошибка введите число!")
                pass
        return self.user_input

    def choose_change_contact(self):
        self.user_input = None
        while self.user_input not in range(1, 4):
            try:
                self.user_input = int(input("Изменение контакта: \n" +
                "1 - Изменить имя\n" +
                "2 - Изменить фамилию\n" +
                "3 - Изменить номер телефона\n" +
                "Выберите пункт: "))
            except:
                print("Ошибка введите число!")
                pass
        return self.user_input

    def choose_format(self):
        self.user_input = None
        while self.user_input not in range(1, 3):
            try:
                self.user_input = int(input("В каком формате: \n" +
                "1 - Горизонатльный\n" +
                "2 - Вертикальный\n" +
                "Выберите пункт: "))
            except:
                print("Ошибка введите число!")
                pass
        return self.user_input

    def file_not_found(self):
        self.user_input = None
        while self.user_input not in range(1, 3):
            try:
                self.user_input = int(input("Ошибка файл не найден! Создать файл?: \n" +
                "1 - Да\n" +
                "2 - Нет\n" +
                "Выберите пункт: "))
            except:
                print("Ошибка введите число!")
                pass
        return self.user_input

    def contact_not_found(self):
        print("Ошибка! Контакт не найден!")

    def print_contact_in_list(self,index: int,contact):
        print("Контакт найден!")
        print(f"{index + 1}. {contact.get_name()} {contact.get_surname()} {contact.get_phone_number()}")

    def print_all_contacts(self,contacts):
        print("Список контактов:")
        if len(contacts) == 0:
            print("Список контактов пуст!")
        else:
            for contact in contacts:
                print(f"{(contacts.index(contact)) + 1}. {contact.get_name()} {contact.get_name()} {contact.get_phone_number()}")

    def input_name(self):
        self.user_input = "1"
        while self.user_input.isdigit():
            try:
                self.user_input = input("Введите Имя: ")
            except:
                print("Ошибка введите текст!")
                pass
        return self.user_input

    def input_surname(self):
        self.user_input = "1"
        while self.user_input.isdigit():
            try:
                self.user_input = input("Введите Фамилию: ")
            except:
                print("Ошибка введите текст!")
                pass
        return self.user_input

    def input_phone_number(self):
        while True:
            try:
                self.user_input = int(input("Введите Номер телефона: "))
                return self.user_input
            except:
                print("Пожалуйста введите номер в числовом формате!")
                continue

    def file_name(self):
        self.user_input = "1"
        while self.user_input.isdigit():
            try:
                self.user_input = input("Введите имя файла `example.txt`: ")
            except:
                print("Ошибка введите текст!")
                pass
        return self.user_input

    def contact_parametr(self):
        self.user_input = "1"
        while self.user_input.isdigit():
            try:
                self.user_input = input("Введите параметр: ")
            except:
                print("Ошибка введите текст!")
                pass
        return self.user_input

    def lots_contacts(self):
        print("Ошибка! Найдено много контактов, пожалуйста добавте еще один параметр!")

    def index_contact_in_list(self,book):
        self.print_all_contacts(book.get_all_contacts())
        while True:
            try:
                self.user_input = int(input("Выберите контакт: "))
                return self.user_input
            except:
                print("Пожалуйста введите число!")
                continue

    def clear_console(self):
        [print("\n") for x in range(500)]

    def press_enter(self):
        input("Нажмити \"ENTER\" для продолжения...")

    def contact_successfully_deleted(self):
        print("Контакт успешно удалён!")

    def contact_successfully_input(self):
        print("Контакты успешно добавлены!")

    def contact_successfully_extract(self):
        print("Контакты успешно экспортированы!")

