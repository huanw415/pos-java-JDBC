package com.thoughtworks.iamcoach.pos.module;

import com.thoughtworks.iamcoach.pos.Category;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CategoryTest {
    @Test
    public void can_get_category_paraments(){
        String name = "drink";
        Category category = new Category(name);

        assertThat(category.getId()).isEqualTo(0);
        assertThat(category.getName()).isEqualTo(name);
    }

    @Test
    public void can_transform_to_string(){
        String name = "drink";
        Category category = new Category(name);
        String result = "Category{" +
                "id=" + category.getId() +
                ", name='" + category.getName() + '\'' +
                '}';
        assertThat(category.toString()).isEqualTo(result);
    }
}