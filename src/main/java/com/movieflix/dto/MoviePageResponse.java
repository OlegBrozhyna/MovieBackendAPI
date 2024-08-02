package com.movieflix.dto;

import java.util.List;

/**
 * MoviePageResponse is a record that represents a response for movie pages.
 * It contains the page number, total number of pages, and a list of movies.
 * <p>
 * Advantages of using a record:
 * - Less code: Getters, equals(), hashCode(), and toString() are automatically generated.
 * - Immutability: Objects are immutable, which enhances code safety and reliability.
 */
public record MoviePageResponse(List<MovieDto> movieDtos,
                                Integer pageNumber,
                                Integer pageSize,
                                long totalElement,
                                int totalPage,
                                boolean isLast) {
}
