Project created to replicate an issue with `lein-test-refresh`

To replicate:

1. Run `lein test-refresh`. Test should pass.
2. In another shell run `lein repl`.
3. Edit either `core.clj` or `core_test.clj` to trigger a test refresh. **Now tests don't pass when and I believe they should**.

My guess is that `lein test-refresh` starts working in the `test` profile but somehow the new repl makes test-refresh hotload the project with the `dev` profile.
