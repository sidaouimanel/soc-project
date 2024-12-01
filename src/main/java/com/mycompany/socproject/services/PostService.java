package com.mycompany.socproject.services;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.socproject.model.Post;
import jakarta.jws.WebService;
import jakarta.jws.WebMethod;
import java.util.ArrayList;
import java.util.List;

@WebService
public class PostService {

    // Liste des posts (simulée ici, tu peux remplacer par une base de données)
    private List<Post> posts = new ArrayList<>();

    // Méthode GET : Récupérer tous les posts
    @WebMethod
    public List<Post> getPosts() {
        return posts;
    }

    // Méthode POST : Créer un nouveau post
    @WebMethod
    public Post createPost(Post post) {
        posts.add(post);
        return post; // Retourne le post créé
    }

    // Méthode PUT : Mettre à jour un post entier
    @WebMethod
    public Post updatePost(int id, Post updatedPost) {
        for (Post post : posts) {
            if (post.getId() == id) {
                post.setTitle(updatedPost.getTitle());
                post.setBody(updatedPost.getBody());
                post.setUserId(updatedPost.getUserId());
                return post; // Retourne le post mis à jour
            }
        }
        return null; // Si le post n'est pas trouvé
    }

    // Méthode PATCH : Mettre à jour partiellement un post
    @WebMethod
    public Post patchPost(int id, Post patchData) {
        for (Post post : posts) {
            if (post.getId() == id) {
                if (patchData.getTitle() != null) {
                    post.setTitle(patchData.getTitle());
                }
                if (patchData.getBody() != null) {
                    post.setBody(patchData.getBody());
                }
                if (patchData.getUserId() != 0) {
                    post.setUserId(patchData.getUserId());
                }
                return post; // Retourne le post modifié
            }
        }
        return null; // Si le post n'est pas trouvé
    }
}

