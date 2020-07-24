package com.greenfoxacademy.backend_api.integration;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.nio.charset.StandardCharsets;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ArraysTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(),
      StandardCharsets.UTF_8);

  @Autowired
  private MockMvc mockMvc;

  @Test
  public void arrays_sum() throws Exception {
    mockMvc.perform(post("/arrays")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"what\": \"sum\", \"numbers\": [1,2,5,10]}"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result", is(18)));
  }

  @Test
  public void arrays_multiply() throws Exception {
    mockMvc.perform(post("/arrays")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"what\": \"multiply\", \"numbers\": [1,2,5,10]}"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result", is(100)));
  }

  @Test
  public void arrays_double() throws Exception {
    mockMvc.perform(post("/arrays")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"what\": \"double\", \"numbers\": [1,2,5,10]}"))
        .andExpect(status().isOk())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.result").isArray())
        .andExpect(jsonPath("$.result", hasSize(4)))
        .andExpect(jsonPath("$.result", hasItem(2)))
        .andExpect(jsonPath("$.result", hasItem(4)))
        .andExpect(jsonPath("$.result", hasItem(10)))
        .andExpect(jsonPath("$.result", hasItem(20)));
  }

  @Test
  public void arrays_errorIfEmptyArray() throws Exception {
    mockMvc.perform(post("/arrays")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"what\": \"sum\", \"numbers\": []}"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
  }

  @Test
  public void arrays_errorIfNoWhat() throws Exception {
    mockMvc.perform(post("/arrays")
        .contentType(MediaType.APPLICATION_JSON)
        .content("{\"numbers\": [1,2,5,10]}"))
        .andExpect(status().isBadRequest())
        .andExpect(content().contentType(contentType))
        .andExpect(jsonPath("$.error", is("Please provide what to do with the numbers!")));
  }
}
