package com.example.projectmanagement.PMJ.repository;

import com.example.projectmanagement.PMJ.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findCommentByIssueId(Long issueId);
}
