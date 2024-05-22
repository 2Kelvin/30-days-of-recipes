package com.example.a30daysofrecipes

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.a30daysofrecipes.model.Recipe
import com.example.a30daysofrecipes.model.recipesList
import com.example.a30daysofrecipes.ui.theme.My30DaysOfRecipesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            My30DaysOfRecipesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RecipeApp(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

// complete app
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RecipeApp(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        CenterAlignedTopAppBar(
            title = {
                Text(
                    text = stringResource(id = R.string.header),
                    modifier = Modifier.padding(bottom = 10.dp),
                    style = MaterialTheme.typography.titleMedium
                )
            }
        )

        AllRecipes(allRecipes = recipesList)
    }
}

// vertical scrolling grid of all Recipes
@Composable
fun AllRecipes(allRecipes: List<Recipe>, modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2), // grid columns
        horizontalArrangement = Arrangement.spacedBy(10.dp), // horizontal gap
        verticalArrangement = Arrangement.spacedBy(10.dp), // vertical gap
        modifier = modifier.padding(10.dp)
    ) {
        items(allRecipes) {
            OneRecipe(recipe = it)
        }
    }
}

// one Recipe item component
@Composable
fun OneRecipe(recipe: Recipe, modifier: Modifier = Modifier) {
    ElevatedCard(modifier = modifier, elevation = CardDefaults.cardElevation(5.dp)) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Text( // day
                text = stringResource(id = recipe.day),
                style = MaterialTheme.typography.labelSmall,
                modifier = Modifier.padding(start = 5.dp, top = 10.dp)
            )
            Text( // Recipe name | title
                text = stringResource(id = recipe.name),
                style = MaterialTheme.typography.displayMedium,
                modifier = Modifier.padding(start = 5.dp, bottom = 10.dp)
            )
            Box(modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)) {// image
                Image(
                    painter = painterResource(id = recipe.img),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                )
            }
            Text( // description
                text = stringResource(id = recipe.desc),
                style = MaterialTheme.typography.bodyMedium,
                modifier = Modifier.padding(start = 5.dp, top = 10.dp, bottom = 10.dp)
            )
        }
    }
}

@Preview
@Composable
fun RecipePreview() {
    My30DaysOfRecipesTheme(darkTheme = false) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            RecipeApp(modifier = Modifier.padding(innerPadding))
        }
    }
}

@Preview
@Composable
fun RecipeDarkPreview() {
    My30DaysOfRecipesTheme(darkTheme = true) {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            RecipeApp(modifier = Modifier.padding(innerPadding))
        }
    }
}