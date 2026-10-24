# Gradient Descent & Multivariable Calculus Extension

## Sum of squared residuals

a 3D paraboloid error function && leading coefficient > 0 $\implies$ its partial derivatives = 0 $\Leftrightarrow$ its minimum
has convex paraboloid shape

linear regression: $y=ax+s$

**Error Function:**

$$
f(a, s) = \sum ((ax_i + s)-y_i)^2
$$

**Partial Derivatives**:

$$
\frac{\partial f}{\partial s} = \sum 2((ax_i + s) - y_i) \qquad \frac{\partial F}{\partial a} = \sum 2x_i((ax_i + s) - y_i)
$$

**Step SIze (using learning rate $\eta$):**

$$
s_{n+1} = s_n - \eta \ \left. \frac{\partial f}{\partial s} \right |_{(a, s) = (a_n, s_n)} \quad \text{and} \quad a_{n+1} = a_n - \eta \ \left. \frac{\partial f}{\partial a} \right |_{(a, s) = (a_n, s_n)}
$$


## 2D Gradient Application (z = f(a, s))

**Visualization:**

<p align="center">
  <img src="gradient descent visualization.png" alt="3D Paraboloid & 2D Convergence Contour Map" width="100%">
</p>

$\nabla f$ is a vector field (set of continuous vector outputs)


$$
\nabla f(a, s) = \frac{\partial f}{\partial a} \ \hat{i} + \frac{\partial f}{\partial s} \ \hat{j}
$$

$$
\vec{x}_n = a_n \hat{i} + s_n \hat{j} \quad \text{(on as-plane)}
$$


$$
\vec{x}_{n+1} = \vec{x}_n - \eta \ \nabla f(a_n, s_n) \qquad \Leftrightarrow \qquad s_{n+1} = s_n - \eta \ \left. \frac{\partial f}{\partial a} \right |_{(a, s) = (a_n, s_n)} \ \text{ and } \quad a_{n+1} = a_n - \eta \ \left. \frac{\partial f}{\partial s} \right |_{(a, s) = (a_n, s_n)}
$$

$$
\frac{\partial f}{\partial a} = 0 \ \& \ \frac{\partial f}{\partial s} = 0 \qquad \Leftrightarrow \qquad \|\nabla f(a_\text{vertex}, s_\text{vertex})\| = 0
$$

- Paraboloid Mapping (Left): Illustrates the Sum of Squared Residuals (SSR) as a convex function. The red curve tracks 3D gradient descent path on the surface toward the global minimum (Vertex).

- 2D Vector Contour Projection (Right): optimization trajectory ($\vec{x}_n = a_n \hat{i} + s_n \hat{j}$) on the parameter plane (a-axis vs s-axis).

  It visually shows how sequence of updated vector component converges to vertex coordinate (as-plane): $\lim_{n \to \infty} a_n = a_{\text{vertex}}$ and $\lim_{n \to \infty} s_n = s_{\text{vertex}}$.

## Project Overview
- (Implementation):  Integrated partial differentiation to upgrade a Java-based linear regression tool for highway traffic modeling.
- (Tools Extension): Self-studied Vector Calculus to re-analyze the optimization trajectory via 2D Gradient Field (∇f).


# Convergence & Limitations
- The algorithm requires a sufficiently small learning rate (η) to ensure convergence. On a paraboloid surface (unsure about other shapes), convergence slows significantly near the local minimum as the gradient magnitude approaches zero (||∇f|| ≈ 0), illustrating the classic vanishing gradient behavior in basic optimization
