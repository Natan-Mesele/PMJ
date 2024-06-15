package com.example.projectmanagement.PMJ.service;

import com.example.projectmanagement.PMJ.model.Issue;
import com.example.projectmanagement.PMJ.model.User;
import com.example.projectmanagement.PMJ.request.IssueRequest;

import java.util.List;

public interface IssueService {

    Issue getIssueById(Long issueId) throws Exception;
    List<Issue> getIssueByProjectId(Long projectId) throws Exception;
    Issue createIssue(IssueRequest issue, User user) throws Exception;
    void deleteIssue(Long issueId, Long userid) throws Exception;
    Issue addUserToIssue(Long issueId, Long userId) throws Exception;
    Issue updateStatus(Long issueId, String status) throws Exception;
}
