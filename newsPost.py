# List to store news posts
news_posts = []

def add_post():
    title = input("Enter the title of the news post: ")
    content = input("Enter the content of the news post: ")
    news_posts.append({"title": title, "content": content})
    print("News post added successfully!")

def view_posts():
    print("\n===== News Posts =====")
    for index, post in enumerate(news_posts):
        print(f"{index + 1}. {post['title']}")
        print(post['content'])
        print("----------------------")

def delete_post():
    view_posts()
    try:
        index = int(input("Enter the index of the post you want to delete: ")) - 1
        if 0 <= index < len(news_posts):
            del news_posts[index]
            print("News post deleted successfully!")
        else:
            print("Invalid index. Please try again.")
    except ValueError:
        print("Invalid input. Please enter a valid index.")

# Main program loop
while True:
    print("\n===== News Posting Program =====")
    print("1. Add News Post")
    print("2. View News Posts")
    print("3. Delete News Post")
    print("4. Exit")
    choice = input("Enter your choice: ")

    if choice == "1":
        add_post()
    elif choice == "2":
        view_posts()
    elif choice == "3":
        delete_post()
    elif choice == "4":
        print("Exiting the program. Goodbye!")
        break
    else:
        print("Invalid choice. Please try again.")
