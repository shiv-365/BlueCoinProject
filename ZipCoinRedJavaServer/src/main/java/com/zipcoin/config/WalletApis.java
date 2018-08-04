package com.zipcoin.config;

public class WalletApis {
    public static final String BASE_WALLET_URL = "api/v1/wallets";
    public static final String GET_WALLET_BY_PUBLIC_KEY = BASE_WALLET_URL + "/{publicKey}";
    public static final String GET_ALL_WALLET_PUBLIC_KEYS = BASE_WALLET_URL + "/publicKeys";
}
