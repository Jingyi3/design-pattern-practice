package com.olivia.mosh.memento;

public class Editor {
    private String content;

    public EditorState createState() {
        // An Editor will save current state inside the EditorState object and return it
        return new EditorState(content);
    }

    public void restore(EditorState state) {
        content = state.getContent();
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
