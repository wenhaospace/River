package com.river.start.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Account")
public class Account {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "account_id")
        private Long accountId;

        @Column(name = "account")
        private String account;

        @Column(name = "password")
        private String password;

        @Column(name = "identity_card_number")
        private String identityCardNumber;

        public Long getAccountId() {
                return accountId;
        }

        public void setAccountId(Long accountId) {
                this.accountId = accountId;
        }

        public String getAccount() {
                return account;
        }

        public void setAccount(String account) {
                this.account = account;
        }

        public String getPassword() {
                return password;
        }

        public void setPassword(String password) {
                this.password = password;
        }

        public String getIdentityCardNumber() {
                return identityCardNumber;
        }

        public void setIdentityCardNumber(String identityCardNumber) {
                this.identityCardNumber = identityCardNumber;
        }

        @Override
        public String toString() {
                return "Account{" +
                        "account='" + account + '\'' +
                        ", password='" + password + '\'' +
                        ", identityCardNumber='" + identityCardNumber + '\'' +
                        '}';
        }
}
