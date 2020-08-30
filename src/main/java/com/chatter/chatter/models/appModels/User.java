package com.chatter.chatter.models.appModels;

import com.chatter.chatter.models.enums.Gender;
import com.chatter.chatter.models.enums.Language;
import com.chatter.chatter.models.enums.MessageType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

    private String firstName;
    private String middleNames;
    private String lastName;
    private String mailAddress;
    private String profilePhotoUrl;
    private Gender gender;
    private String aboutMe;
    private Date birthDate;
    private Language userLanguage;
    private List<User> friendList;

    public User(String firstName, String middleNames, String lastName, String mailAddress, String profilePhotoUrl, Gender gender, String aboutMe, Date birthDate, Language userLanguage, List<User> friendList) {
        this.firstName = firstName;
        this.middleNames = middleNames;
        this.lastName = lastName;
        this.mailAddress = mailAddress;
        this.profilePhotoUrl = profilePhotoUrl;
        this.gender = gender;
        this.aboutMe = aboutMe;
        this.birthDate = birthDate;
        this.userLanguage = userLanguage;
        this.friendList = friendList;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleNames() {
        return middleNames;
    }

    public void setMiddleNames(String middleNames) {
        this.middleNames = middleNames;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.middleNames + " " + this.lastName;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    public String getProfilePhotoUrl() {
        return profilePhotoUrl;
    }

    public void setProfilePhotoUrl(String profilePhotoUrl) {
        this.profilePhotoUrl = profilePhotoUrl;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Language getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(Language userLanguage) {
        this.userLanguage = userLanguage;
    }

    public List<User> getFriendList() {
        return friendList;
    }

    public void setFriendList(List<User> friendList) {
        this.friendList = friendList;
    }

    public List<Message> getConversation(int userId) {
        User user = new User("Anil", "", "Yurtsever", "test@test", "https://bootdey.com/img/Content/avatar/avatar6.png", Gender.MALE, "", new Date(), Language.ENGLISH, new ArrayList<>());
        ArrayList<Message> messages = new ArrayList<>();
        Message message = new Message(this, user, MessageType.TEXT, "hello1");
        Message message2 = new Message(user, this, MessageType.TEXT, "hello2");
        Message message3 = new Message(user, this, MessageType.TEXT, "hello3");
        Message message4 = new Message(this, user, MessageType.TEXT, "hello4");
        Message message5 = new Message(user, this, MessageType.TEXT, "hello5");
        Message message6 = new Message(this, user, MessageType.TEXT, "hello6");
        messages.add(message);
        messages.add(message2);
        messages.add(message3);
        messages.add(message4);
        messages.add(message5);
        messages.add(message6);
        return messages;
    }
}
