package com.example.game;

import javax.security.auth.login.CredentialException;

public class Pair<L,R> {
    private L l;
    private R r;

    public Pair(L l, R r){
        this.l = l;
        this.r = r;
    }

    public L getLeft() {
        return this.l;
    }

    public R getRight(){
        return this.r;
    }
}
