package com.example.projectmanagement.PMJ.service;

import com.example.projectmanagement.PMJ.model.Invitation;
import jakarta.mail.MessagingException;

public interface InvitationService {

    public void sendInvitation(String email, Long projectId) throws MessagingException;
    public Invitation acceptInvitation(String token, Long userId) throws Exception;
    public String getTokenUserMail(String userEmail);
    void deleteToken(String token);
}
