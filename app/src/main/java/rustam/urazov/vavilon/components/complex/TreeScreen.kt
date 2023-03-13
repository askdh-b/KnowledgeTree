package rustam.urazov.vavilon.components.complex

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import rustam.urazov.vavilon.components.models.BranchModel
import rustam.urazov.vavilon.ui.theme.VavilonTheme

@Composable
fun TreeScreen(
    branches: List<BranchModel>
) {
    BoxWithConstraints(
        modifier = Modifier.padding(16.dp)
    ) {
        val height = maxHeight
        Column {
            LazyColumn(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height - 60.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(branches) { branch ->
                    Branch(text = branch.title) {

                    }
                }
            }
            AddButton { }
        }
    }
}

@Composable
@Preview
fun TreeScreenPreview() {
    VavilonTheme {
        TreeScreen(
            listOf(
                BranchModel(1, "asd", null),
                BranchModel(2, "asd", null)
            )
        )
    }
}