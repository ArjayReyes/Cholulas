# User database (dictionary to store username and password)
user_database = {}


def signup():
    print("===== Sign Up =====")
    username = input("Enter your username: ")
    # Check if username already exists
    if username in user_database:
        print("Username already exists. Please try again.")
    else:
        password = input("Enter your password: ")
        user_database[username] = password
        print("Sign up successful! You can now sign in.")


def signin():
    print("===== Sign In =====")
    username = input("Enter your username: ")
    password = input("Enter your password: ")

    # Check if username and password match
    if username in user_database and user_database[username] == password:
        print("Welcome, " + username + "! You are now signed in.")
    else:
        print("Invalid username or password. Please try again.")


# Main program loop
while True:
    print("===== Welcome to the Login System =====")
    print("1. Sign Up")
    print("2. Sign In")
    print("3. Exit")
    choice = input("Enter your choice: ")

    if choice == "1":
        signup()
    elif choice == "2":
        signin()
    elif choice == "3":
        print("Goodbye! Exiting the program.")
        break
    else:
        print("Invalid choice. Please try again.")
