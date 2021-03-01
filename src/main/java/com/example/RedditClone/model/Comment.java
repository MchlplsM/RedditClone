package com.example.RedditClone.model;

import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//BIG BIG BIG - If you enable "enable annotations processing" with Opt + Shift + A, the getters/setters etc will be automatically be created during RUNTIME!!!!

@Data //generates getters and setters of class
@Entity //generates the constructors of the class
@Builder //Builder design pattern
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;
    private String postName;
    @Nullable
    private String url;


}
