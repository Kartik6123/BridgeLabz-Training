public class SocialMedia {

    // Friend list node
    class FriendNode {
        int friendId;
        FriendNode next;

        FriendNode(int friendId) {
            this.friendId = friendId;
            this.next = null;
        }
    }

    // User node
    class UserNode {
        int userId;
        String name;
        int age;
        FriendNode friends;
        UserNode next;

        UserNode(int userId, String name, int age) {
            this.userId = userId;
            this.name = name;
            this.age = age;
            this.friends = null;
            this.next = null;
        }
    }

    UserNode head;

    // Add new user
    void addUser(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        newUser.next = head;
        head = newUser;
    }

    // Add friend connection
    void addFriend(int userId, int friendId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        FriendNode newFriend = new FriendNode(friendId);
        newFriend.next = user.friends;
        user.friends = newFriend;
    }

    // Remove friend connection
    void removeFriend(int userId, int friendId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        FriendNode temp = user.friends;
        if (temp != null && temp.friendId == friendId) {
            user.friends = temp.next;
            return;
        }

        while (temp != null && temp.next != null && temp.next.friendId != friendId)
            temp = temp.next;

        if (temp != null && temp.next != null)
            temp.next = temp.next.next;
    }

    // Find mutual friends
    void findMutualFriends(int u1, int u2) {
        UserNode user1 = findUserById(u1);
        UserNode user2 = findUserById(u2);
        if (user1 == null || user2 == null) return;

        FriendNode f1 = user1.friends;
        while (f1 != null) {
            FriendNode f2 = user2.friends;
            while (f2 != null) {
                if (f1.friendId == f2.friendId)
                    System.out.println("Mutual Friend ID: " + f1.friendId);
                f2 = f2.next;
            }
            f1 = f1.next;
        }
    }

    // Display all friends of a user
    void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        FriendNode temp = user.friends;
        while (temp != null) {
            System.out.println("Friend ID: " + temp.friendId);
            temp = temp.next;
        }
    }

    // Search user by name
    void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name))
                System.out.println(temp.userId + " " + temp.name + " " + temp.age);
            temp = temp.next;
        }
    }

    // Count friends for each user
    void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            int count = 0;
            FriendNode f = temp.friends;
            while (f != null) {
                count++;
                f = f.next;
            }
            System.out.println(temp.name + " has " + count + " friends");
            temp = temp.next;
        }
    }

    // Helper method
    UserNode findUserById(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId)
                return temp;
            temp = temp.next;
        }
        return null;
    }
}

