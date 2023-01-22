
class Contact():
    def __init__(self,contact_name: str,contact_surname: str,contact_phone_number: int):
        self.name = contact_name
        self.surname = contact_surname
        self.phone_number = contact_phone_number

    def set_name(self,contact_name:str):
        self.name = contact_name

    def set_surname(self,contact_surname:str):
        self.surname = contact_surname

    def set_phone_number(self,contact_phone_number:int):
        self.phone_number = contact_phone_number

    def get_name(self):
        return self.name

    def get_surname(self):
        return self.surname

    def get_phone_number(self):
        return self.phone_number
