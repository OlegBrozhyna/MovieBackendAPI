package com.movieflix.dto;

import lombok.Builder;

/**
 * MoviePageResponse is a record that represents a response for movie pages.
 * It contains the page number, total number of pages, and a list of movies.
 * <p>
 * Advantages of using a record:
 * - Less code: Getters, equals(), hashCode(), and toString() are automatically generated.
 * - Immutability: Objects are immutable, which enhances code safety and reliability.
 */

@Builder
public record MailBody(String to, String subject, String text) {
}
