package com.erin.Everdrobe.ui;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;


    public class Item implements Parcelable{

        private String name;
        private String condition;
        private String imgURL;


        public Item(String name, String condition, String imgURL) {
            this.name = name;
            this.condition = condition;
            this.imgURL = imgURL;

        }


        protected Item(Parcel in) {
            name = in.readString();
            condition = in.readString();
            imgURL = in.readString();
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

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(name);
            dest.writeString(condition);
            dest.writeString(imgURL);
        }
    }
