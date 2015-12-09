package com.fusionskye.ezsonar.message.model;

import com.google.common.base.MoreObjects;

/**
 * @author wei.Li by 15/12/8
 */
public class LinkedNode {

    private String key;
    private Object value;

    private LinkedNode next;

    public LinkedNode(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public LinkedNode getNext() {
        return next;
    }

    public void setNext(LinkedNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("key", key)
                .add("value", value)
                .add("next", next)
                .toString();
    }
}