package com.erin.Everdrobe.ui;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;


    public class Item implements Parcelable{

        private String name;
        private String condition;
        private String imgURL;
        private String size;
        private String username;


        public Item(String name, String condition, String imgURL, String size, String username) {
            this.name = name;
            this.condition = condition;
            this.imgURL = imgURL;
            this.size = size;
            this.username = username;

        }


        public Item(Parcel in) {
            name = in.readString();
            condition = in.readString();
            imgURL = in.readString();
            size = in.readString();
            username = in.readString();
        }

        public static final Creator<Item> CREATOR = new Creator<Item>() {
            @Override
            public Item createFromParcel(Parcel in) {
                return new Item(in);
            }

            @Override
            public Item[] newArray(int size) {
                return new Item[size];
            }
        };

        public String getName() {
            return name;
        }

        public void setName(String item) {
            this.name = name;
        }

        public String getCondition() {
            return condition;
        }

        public void setCondition(String condition) {
            this.condition = condition;
        }

        public String getImgURL() {
            return imgURL;
        }

        public void setImgURL(String imgURL) {
            this.imgURL = imgURL;
        }
        public String getSize() {
            return size;
        }

        public void setSize(String item) {
            this.size = size;
        }
        public String getUsername() {
            return username;
        }

        public void setUsername(String item) {
            this.username = username;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name);
            dest.writeString(condition);
            dest.writeString(imgURL);
            dest.writeString(size);
            dest.writeString(username);

        }
    }
